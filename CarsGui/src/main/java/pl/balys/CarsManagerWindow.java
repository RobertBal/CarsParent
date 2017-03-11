package pl.balys;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class CarsManagerWindow extends JFrame {

    private JButton jButton;
    private JButton jEdit;

    private JTextField jTextBrand;
    private JTextField jTextModel;
    private JTextField jTextManufactureYear;
    private JTextField jTextPower;




    private JTextArea jTextArea;
    private JList<CarsData> jList;
    private CarRepository carRepository;

    public static void main(String[] args) {

        new CarsManagerWindow();
    }
    public CarsManagerWindow(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        jList = new JList<>();

        jList.setSize(400,500);
        jList.setLocation(0,0);
        jFrame.add(jList);



        jButton = new JButton();
        jButton.setText("Car");
        jButton.setSize(80,50);
        jButton.setLocation(450,300);
        jFrame.add(jButton);



        jEdit = new JButton();
        jEdit.setText("Edit");
        jEdit.setSize(80,50);
        jEdit.setLocation(450,400);
        jFrame.add(jEdit);



        carRepository = new CarRepository();

        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<CarsData> carList = carRepository.getCarList();
                CarsData[] carsDatas = new CarsData[carList.size()];
                for(int i=0;i<carList.size();i++){
                    carsDatas[i]=carList.get(i);
                }
                jList.setListData(carsDatas);

            }
        }



        );
        repaint();


    }



}
