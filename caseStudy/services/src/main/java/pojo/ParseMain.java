package pojo;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;


public class ParseMain{
    static int numCompanies;
    public static void main(String[] args){
        ArrayList<Company> companies=new ArrayList<Company>(numCompanies);
        ArrayList<Stock> stocks=new ArrayList<Stock>(numCompanies);

        Gson gson=new Gson();
        FileReader companyFileReader = null;
        try{
            companyFileReader = new FileReader("../../resources/data/companyInfo.json");
        }
        catch(IOException e){
            System.out.println("Error");
        }
        CompanyList companyList=gson.fromJson(companyFileReader,CompanyList.class);

        for(int i=0;i<companyList.companyArray.length;i++){
            System.out.println(companyList.companyArray[i].getName());
        }
        /*File companyFile = new File("../../resources/data/companyInfo.json");
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(companyFile);
            String line;
            while((line = bufferedReader)) 
        }*/
    }
}

