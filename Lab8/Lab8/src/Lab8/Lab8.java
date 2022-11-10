package Lab8;

public class Lab8 {
	

        public static void main(String[] args) {
                String input = "";
                RecordList list = new RecordList();
                do {
                 
                        input = javax.swing.JOptionPane.showInputDialog("Please enter your (name, time)");
                        
                        if (input != null) {
                                double time;
                                String name;
                                
                            
                                try {
                                        String [] parts = input.split(",");
                                        name = parts[0].trim();
                                        String timeStr = parts[1].trim();
                                        time = Double.parseDouble(timeStr);
                                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                                        javax.swing.JOptionPane.showMessageDialog(null, "Invalid input, please try again");
                                        continue; 
                                }

                                Record r = new Record(name, time);
                                int result = list.add(r);
                             
                                if (result == 0) {
                                        javax.swing.JOptionPane.showMessageDialog(null, name + " use the shortest time");
                                }
                              
                        }
                } while (input != null);
                
                list.writeToFile("data/recordList.txt");
         
        }

}
