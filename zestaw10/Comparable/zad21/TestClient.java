package zestaw10.Comparable.zad21;

import java.util.ArrayList;
import java.util.Collections;

public class TestClient {

    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<>();
        ArrayList<Client> clientList2 = new ArrayList<>();

        clientList.add(new Client("ab",4356.32));
        clientList.add(new Client("gdf",4356.32));
        clientList.add(new Client("lhkg",9856.32));
        clientList.add(new Client("mcnvb",1334.32));
        clientList.add(new Client("djk",943.32));
        clientList2.add(new Company("vhj",4657.34,532));
        clientList2.add(new Company("vhj",3847.34,532));
        clientList2.add(new Company("vhj",9543.34,354));
        clientList2.add(new Company("vhj",2363.34,147));
        clientList2.add(new Company("vhj",9595.34,445));

        Collections.sort(clientList);
        Collections.sort(clientList2);
        System.out.println(clientList);
        System.out.println(clientList2);
    }



}
