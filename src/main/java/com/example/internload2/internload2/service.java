package com.example.internload2.internload2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class service  {
    @Autowired
    private datarep ds;
    public void saves (data Data){
        ds.save(Data);
    }
  public Optional<data> loadidsear(Long id){
         try {
             return ds.findById(id);
         }catch (Exception e){
         }
         return null;
  }
    public String dele(Long loadid){
        if(ds.existsById(loadid)){
            return "deleted successfully";
        }
    return "no id exists";
    }
    public String updates(Long id,data news){
     news.setLoadid(id);

     ds.save(news);
      return "updated";
    }

    public List<data> getshipperdata(String Shipperid){
       List<data> Sampledata=ds.findAll();
        List<data> cdata=new ArrayList<>();
        for(int y=0;y<Sampledata.size();y++){
            if(Sampledata.get(y).getShipperid().equals(Shipperid)){
             cdata.add(Sampledata.get(y));
         }
        }
  return  cdata;
    }

}
