
package algorithms;
import java.util.*;

  class ListNode {
        int vertex, weight;
        ListNode(int v, int w) {
            vertex = v;
            weight = w;
        }
        int getVertex() {
            return vertex;
        }
        int getWeight() {
            return weight;
        }
    }
class data{
    String name ;
    String phone;
    String add;
    data (String name ,String phone,String add)
    {
        name = name;
        phone = phone;
        add=add;
    }
    
}
public class pizaa_menu extends javax.swing.JFrame 
{
    data order = new data(" " , " " , " ");
    static data[] arr = new data[10];

   
    static String order_code=" ";
   static int[] distance;
    int d,time,cost,price,t_cost;

    static int get_price(int x)
    {
        int p =0;
        switch(x){
            case 1:
                p=20;
             break;
            case 2:
                p=18;
                break;
            case 3 :
                p=25;
                break; 
        }
         return p;     
    }  
    static data sereach(String x)
    {
        int i =0;
        while(arr[i].phone!=x)
        i++;
        
        return arr[i];
    }
    //_______________________________________________________________
    static void add(data x)
    {
        int i =0;
        while(arr[i] !=null)
        i++;
        
        arr[i]=x;   
    }
    
    //__________________________________________________________________
    
    public static int[] dijkstra(int V, ArrayList<ArrayList<ListNode>> graph,int src) 
    {
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new ListNode(src, 0));

        while (pq.size() > 0) 
        {
            ListNode current = pq.poll();
            for (ListNode n : graph.get(current.getVertex()))
            {
                if (distance[current.getVertex()] + n.getWeight() < distance[n.getVertex()]) 
                {
                    distance[n.getVertex()] = n.getWeight() + distance[current.getVertex()];
                    pq.add(new ListNode(n.getVertex(),distance[n.getVertex()]));
                }
            }
        }
        return distance;
    }
    public pizaa_menu()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chicken_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pepperoni_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cheese_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name_txt_field = new javax.swing.JTextField();
        phone_txt_field = new javax.swing.JTextField();
        add_txt_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirm_buttom = new javax.swing.JButton();
        order_num_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill_txt_area = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        order_num_txt2 = new javax.swing.JTextField();
        phone_txt_2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chicken_panel.setBackground(new java.awt.Color(0, 204, 255));
        chicken_panel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Chicken Pizza");

        jLabel2.setText("20$");

        jLabel8.setText("1");

        javax.swing.GroupLayout chicken_panelLayout = new javax.swing.GroupLayout(chicken_panel);
        chicken_panel.setLayout(chicken_panelLayout);
        chicken_panelLayout.setHorizontalGroup(
            chicken_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chicken_panelLayout.createSequentialGroup()
                .addGroup(chicken_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chicken_panelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chicken_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chicken_panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        chicken_panelLayout.setVerticalGroup(
            chicken_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chicken_panelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pepperoni_panel.setBackground(new java.awt.Color(255, 153, 51));
        pepperoni_panel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setText("Pepperoni Pizza");

        jLabel4.setText("25$");

        jLabel12.setText("3");

        javax.swing.GroupLayout pepperoni_panelLayout = new javax.swing.GroupLayout(pepperoni_panel);
        pepperoni_panel.setLayout(pepperoni_panelLayout);
        pepperoni_panelLayout.setHorizontalGroup(
            pepperoni_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pepperoni_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pepperoni_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pepperoni_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pepperoni_panelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pepperoni_panelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pepperoni_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pepperoni_panelLayout.setVerticalGroup(
            pepperoni_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pepperoni_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        cheese_panel.setBackground(new java.awt.Color(255, 255, 0));
        cheese_panel.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setText("Mix Cheese Pizza");

        jLabel10.setText("18$");

        jLabel11.setText("2");

        javax.swing.GroupLayout cheese_panelLayout = new javax.swing.GroupLayout(cheese_panel);
        cheese_panel.setLayout(cheese_panelLayout);
        cheese_panelLayout.setHorizontalGroup(
            cheese_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cheese_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cheese_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cheese_panelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cheese_panelLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(cheese_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        cheese_panelLayout.setVerticalGroup(
            cheese_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cheese_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        name_txt_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txt_fieldActionPerformed(evt);
            }
        });

        phone_txt_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_txt_fieldActionPerformed(evt);
            }
        });

        add_txt_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_txt_fieldActionPerformed(evt);
            }
        });

        jLabel5.setText("MR / MS");

        jLabel6.setText("phone");

        jLabel7.setText("Location num");

        confirm_buttom.setBackground(new java.awt.Color(51, 255, 0));
        confirm_buttom.setText("confirm order");
        confirm_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttomActionPerformed(evt);
            }
        });

        jLabel13.setText("order code");

        jLabel16.setText("first order");

        bill_txt_area.setColumns(20);
        bill_txt_area.setRows(5);
        bill_txt_area.setText("                           Royal Pizza");
        jScrollPane2.setViewportView(bill_txt_area);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Location num");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Location");

        jLabel17.setText("1");

        jLabel18.setText("El_maadi");

        jLabel19.setText("2");

        jLabel20.setText("Saqr");

        jLabel21.setText("3");

        jLabel22.setText("Dar_Elsalam");

        jLabel23.setText("4");

        jLabel24.setText("El_Zahraa");

        jLabel25.setBackground(new java.awt.Color(0, 51, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY PC\\OneDrive\\Desktop\\69-696561_food-delivery-png.png")); // NOI18N
        jLabel25.setText("Royal Pizza");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Phone");

        jLabel27.setText("order num");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(chicken_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cheese_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(pepperoni_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel20))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel7))))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(order_num_txt)
                                    .addComponent(name_txt_field)
                                    .addComponent(phone_txt_field)
                                    .addComponent(add_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(confirm_buttom)
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(order_num_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirm_buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pepperoni_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(chicken_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cheese_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(phone_txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(order_num_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27))
                                        .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jButton1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_txt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(order_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_txt_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txt_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txt_fieldActionPerformed

    private void add_txt_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_txt_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_txt_fieldActionPerformed

    private void confirm_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttomActionPerformed
        // TODO add your handling code here:
        
       
        order.name=name_txt_field.getText();
        order.add=add_txt_field.getText();
        order.phone=phone_txt_field.getText();
        order_code=order_num_txt.getText();
       
         add(order);
         
         //clear txt
         add_txt_field.setText(" ");
         phone_txt_field.setText(" ");
         name_txt_field.setText(" ");
         order_num_txt.setText("  ")  ;       
   
         //calculate distance and price
         d= distance[Integer.valueOf(order.add)];
         time=d*2;
         cost=d*3;
         t_cost=cost+get_price(Integer.valueOf(order_code));
        
         
          bill_txt_area.setText("                           Royal Pizza\n"
                             + "mr /mrs:    " + order.name + " \n"
                             + "phone num : " + order.phone + " \n"        
                             + "total cost: " + t_cost + " \n"
                             + "time :      " + time + " \n"  );
         
        
         
        
        
    }//GEN-LAST:event_confirm_buttomActionPerformed

    private void phone_txt_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_txt_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_txt_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // TODO add your handling code here:
        order.phone=phone_txt_2.getText();
        order_code=order_num_txt2.getText();
        data x =sereach(order.phone);
        order_num_txt2.setText("  ");
        phone_txt_2.setText("  ");
     
         d=distance[Integer.valueOf(x.add)];
         time=d*2;  
         cost=d*3;
         t_cost=cost+get_price(Integer.valueOf(order_code));
           bill_txt_area.setText("                           Royal Pizza\n"
                             + "mr /mrs:    " + x.name + " \n"
                             + "phone num : " + x.phone + " \n"        
                             + "total cost: " + t_cost + " \n"
                             + "time :      " + time + " \n"  );
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

        
    public static void main(String args[]) 
    {
         int V = 5;
        ArrayList<ArrayList<ListNode>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
        {
            graph.add(new ArrayList<>());
        }
        int source = 0;
        graph.get(0).add(new ListNode(1, 4));
        graph.get(0).add(new ListNode(4, 2 ));
        graph.get(1).add(new ListNode(2, 3));
        graph.get(1).add(new ListNode(3, 5));
        graph.get(1).add(new ListNode(4, 3));
        graph.get(2).add(new ListNode(1, 3));
        graph.get(2).add(new ListNode(3, 2));
        graph.get(3).add(new ListNode(2, 2));
        graph.get(3).add(new ListNode(1, 5));
        graph.get(3).add(new ListNode(4, 2));
        graph.get(4).add(new ListNode(3, 2));
        graph.get(4).add(new ListNode(1, 3));
        graph.get(4).add(new ListNode(0, 2));

         distance = dijkstra(V, graph, source);
       //print the graph
//        System.out.println("Vertex " + "\t" + " Distance from Source");
//
//        for (int i = 0; i < V; i++) {
//            System.out.println(i + " \t\t " + distance[i]);
//        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new pizaa_menu().setVisible(true);
            }
            
        }
                
        );
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField add_txt_field;
    private static javax.swing.JTextArea bill_txt_area;
    private javax.swing.JPanel cheese_panel;
    private javax.swing.JPanel chicken_panel;
    private static javax.swing.JButton confirm_buttom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField name_txt_field;
    private javax.swing.JTextField order_num_txt;
    private javax.swing.JTextField order_num_txt2;
    private javax.swing.JPanel pepperoni_panel;
    private javax.swing.JTextField phone_txt_2;
    private static javax.swing.JTextField phone_txt_field;
    // End of variables declaration//GEN-END:variables
}
