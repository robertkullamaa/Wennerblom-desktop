package Wennerblom;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.sql.ResultSet;

public class RiverTree extends JInternalFrame implements TreeSelectionListener{
    JTree tree;
    JTextField nameField;
    WennerblomMain oParent;


    public RiverTree(JTextField name, WennerblomMain oParent) {
        super("Jõed", false, //resizable
                      false, //closable
                      false, //maximizable
                      false);//iconifiable
        nameField = name;
        this.oParent = oParent;
        initTree();
    }

    public void initTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Jõed");
        tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);
        tree.addTreeSelectionListener(this);

        tree.setShowsRootHandles(true);

        populateTree(root);

        this.add(scrollPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, oParent.getHeight());
        this.setLocation(0, -30);
        this.setVisible(true);
    }

    public void valueChanged(TreeSelectionEvent e) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)
            tree.getLastSelectedPathComponent();
            if (node == null)
            //Nothing is selected.
            return;

            Object nodeInfo = node.getUserObject();
//            if (node.isLeaf()) {
//                nameField.setText(node.getFirstLeaf().toString());
//            }
//            else {
                nameField.setText(node.toString());
//            }
    }

    private void populateTree(DefaultMutableTreeNode root){
        PostGreConnection postgre = new PostGreConnection();
        ResultSet rs = postgre.getResultSet("SELECT * FROM joe_andmed;");

        try{
            Integer j = 0;
            rs.last();
            Integer arraySize = rs.getRow();
            rs.first();

            Integer id_jogi[] = new Integer[arraySize];
            Integer id_peajogi[] = new Integer[arraySize];
            Integer id_suubla[] = new Integer[arraySize];
            String joenimi[] = new String[arraySize];

            while(rs.next()){
                joenimi[j] = rs.getString("joenimi");
                id_jogi[j] = rs.getInt("id_jogi");
                id_peajogi[j] = rs.getInt("id_peajogi");
                id_suubla[j] = rs.getInt("id_suubla");
                j++;
            }

            DefaultMutableTreeNode nodes[] = new DefaultMutableTreeNode[arraySize];
            for(int l=0; l<arraySize-1;l++){
                if(id_jogi[l].equals(id_peajogi[l])){       //kui jõgi on peajõgi
                    nodes[l] = new DefaultMutableTreeNode(joenimi[l]);
                    root.add(nodes[l]);
                }
                else{                                       //muul juhul tee node valmis
                    nodes[l] = new DefaultMutableTreeNode(joenimi[l]);
                }
            }
            for(int l=0; l<arraySize-1;l++){                //lisa alamjõed
                if(!id_jogi[l].equals(id_peajogi[l])) {
                    for(int m = 0; m<arraySize-1;m++){
                        if(id_jogi[m].equals(id_suubla[l])){
                            nodes[m].add(nodes[l]);
                        }

                    }
                }
            }

            rs.close();
           }catch (Exception e){
            System.out.println("Viga! - " + e);
        }
    }

}
