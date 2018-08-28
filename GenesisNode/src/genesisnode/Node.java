/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genesisnode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author mca
 */
public class Node {
    
    private Date timeStamp;
     private String[] data;
    private int nodeNumber;
    private String nodeId;
    private String refernceNodeId;
    private String childReferenceNodeId;
    private String genesisRefernceNodeId;
    private String hashValue;
    Node left,right;
    private String timestamp;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Node(String[] data, int nodeNumber, String nodeId, String refernceNodeId, String childReferenceNodeId, String genesisRefernceNodeId, String hashValue) {
        this.data = data;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.refernceNodeId = refernceNodeId;
        this.childReferenceNodeId = childReferenceNodeId;
        this.genesisRefernceNodeId = genesisRefernceNodeId;
        this.hashValue = hashValue;
    }
    
     public void setTimestamp(Date timestamp) {
            DateFormat dateFormat =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date= new Date();
            this.timestamp = dateFormat.format(date);
        }

    public String getChildReferenceNodeId() {
        return childReferenceNodeId;
    }

    public String[] getData(){
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    

    public String getGenesisRefernceNodeId() {
        return genesisRefernceNodeId;
    }

    public String getHashValue() {
        return hashValue;
    }

    public String getNodeId() {
        return nodeId;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public String getRefernceNodeId() {
        return refernceNodeId;
    }
   
    
    
}
