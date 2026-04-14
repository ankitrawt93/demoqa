package britc.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CsvUtils {
    public static List<Map<String,String>> getCsvData(String filepath){
        List<Map<String,String>> dataList=new ArrayList<>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String[] header =br.readLine().split(",");

            while((line=br.readLine())!=null){
                String [] values =line.split(",");
                Map <String,String> map = new HashMap<>();
                for (int i=0;i< header.length;i++){
                    map.put(header[i].trim(),values[i].trim());
                }
                dataList.add(map);
            }
        }catch ( IOException e){
            e.printStackTrace();
        }
return dataList;
    }
}
