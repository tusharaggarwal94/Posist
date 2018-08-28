/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genesisnode;
import java.security.MessageDigest;
import java.util.*;
/**
 *
 * @author mca
 */
public class ParentNode {
     Node root;
    
    ParentNode()
    {
        root=null;
    }
    ParentNode(String[] str)
    {
        root.setData(str);
    }
    
    ParentNode(String[] data,int nodeNumber, String nodeId, String refernceNodeId, String childReferenceNodeId, String genesisRefernceNodeId, String hashValue)
    {
        root=new Node(data,nodeNumber,nodeId,refernceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
    }    
    
    public static void createParentNode(){
        Scanner sc=new Scanner(System.in);
       String data=sc.nextLine();
       String[] str=data.split(",");
        int nodeNumber=sc.nextInt();
        String nodeId=sc.nextLine();
        String referenceNodeId=sc.nextLine();
        String childReferenceNodeId=sc.nextLine();
        String genesisRefernceNodeId=sc.nextLine();
        String hashValue=sc.nextLine();
        
        ParentNode g=new ParentNode(str);
        
        String d1=sc.nextLine();
         String[] str1=d1.split(",");
        String d2=sc.nextLine();
         String[] str2=d2.split(",");
        
                         
               
        if(Float.valueOf(str[1])>Float.valueOf(str1[1])+Float.valueOf(str2[1])){
         for(int i=0;i<2;i++){
             nodeNumber=sc.nextInt();
         nodeId=sc.nextLine();
         referenceNodeId=sc.nextLine();
         childReferenceNodeId=sc.nextLine();
         genesisRefernceNodeId=sc.nextLine();
         hashValue=sc.nextLine();
            if(i==0){
          g.root.left=new Node(str1,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
            }
            else{
          g.root.right=new Node(str2,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
            }
        } 
      
    }
        String d3=sc.nextLine();
         String[] str3=d3.split(",");
        String d4=sc.nextLine(); 
         String[] str4=d4.split(",");
       if(Float.valueOf(str1[1])>Float.valueOf(str3[1])+Float.valueOf(str4[1])){
            for(int i=0;i<2;i++){
             nodeNumber=sc.nextInt();
         nodeId=sc.nextLine();
         referenceNodeId=sc.nextLine();
         childReferenceNodeId=sc.nextLine();
         genesisRefernceNodeId=sc.nextLine();
         hashValue=sc.nextLine();
            if(i==0){
         g.root.left.left=new Node(str3,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
            }
            else{
        g.root.left.right=new Node(str4,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
         }
         }
       }
       else if(Float.valueOf(str2[1])>Float.valueOf(str3[1])+Float.valueOf(str4[1])){
            for(int i=0;i<2;i++){
             nodeNumber=sc.nextInt();
         nodeId=sc.nextLine();
         referenceNodeId=sc.nextLine();
         childReferenceNodeId=sc.nextLine();
         genesisRefernceNodeId=sc.nextLine();
         hashValue=sc.nextLine();
            if(i==0){
                  g.root.right.left=new Node(str3,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
            }
            else
            {
            g.root.right.right=new Node(str4,nodeNumber,nodeId,referenceNodeId,childReferenceNodeId,genesisRefernceNodeId,hashValue);
            }
       }
         
        
          
       }
    }
   //method to encrypt data 
    
}
