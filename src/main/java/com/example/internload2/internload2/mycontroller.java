package com.example.internload2.internload2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class mycontroller {
	@Autowired
	public service s1=new service();

	//1. post "/load"
	//payload:
	//{
	//	"loadingPoint": "delhi",
	//	"unloadingPoint": "jaipur",
	//	"productType": "chemicals",
	//	"truckType": "canter",
	//	"noOfTrucks": "1",
	//	"weight": "100",
	//            optional:"comment": "",
	//	“shipperId” : “shipper:<UUID>”,
	//	“Date” : “dd-mm-yyyy”
	//
	//}
	@PostMapping("/load")
	public  String tr(@RequestBody data Data ) {
		s1.saves(Data);
		return "loads details added successfully";
	}

	//2.GET “/load”
	//
	//Query params - (shipperId)
	//
	//Response:list of loads with this shipperId
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public String  daqta(@RequestParam("shipperid") String Shipperid){
		return  ":list of loads with this shipperId\n" +s1.getshipperdata(Shipperid).toString();
	}
	//1.GET “load/{loadId}”
	@GetMapping("load/{loadid}")
	public String load(@PathVariable Long loadid){
		return s1.loadidsear(loadid).toString();
	}

	//2.PUT “load/{loadId}”
	//{
	//	"loadingPoint": "alwar",
	//	"unloadingPoint": "jaipur",
	//	"productType": "chemicals",
	//	"truckType": "canter",
	//	"noOfTrucks": "1",
	//	"weight": "100",
	//         "comment": "",
	//          “Date” : “dd-mm-yyyy”
	//}

	@PutMapping("load/{loadid}")
	public String update(@PathVariable Long loadid,@RequestBody data Data){
		return s1.updates(loadid,Data);
	}

   //3.DELETE “load/{loadId}”
	@DeleteMapping("/load/{loadid}")
	public String Deletes(@PathVariable Long loadid){

		return s1.dele(loadid);
	}



}


