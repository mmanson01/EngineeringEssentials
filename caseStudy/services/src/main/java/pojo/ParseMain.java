package pojo;

import java.io.FileReader;
import java.io.FileNotFoundException;
import com.google.gson.Gson;


public class ParseMain{
    static int numCompanies;
    public static void main(String[] args){
        ArrayList<Company> companies=new ArrayList<Company>(numCompanies);
        ArrayList<Stock> stocks=new ArrayList<Stock>(numCompanies);

        Gson gson=new Gson();
        Filereader companyFileReader= new FileReader("../../resources/data/companyInfo.json");
        CompanyList companyList=gson.fromJson(companyFileReader,companyList.class);

        for(int i=0;i<companyList.companyArray.length;i++){
            System.out.println(companyArray[i].getName());
        }
    }
}

