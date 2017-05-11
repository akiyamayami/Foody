package com.hellokoding.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.DiaDiem;
import com.hellokoding.model.MonAn;
import com.hellokoding.model.TinhThanh;
import com.hellokoding.service.DanhMucService;
import com.hellokoding.service.DiaDiemService;
import com.hellokoding.service.MonAnService;
import com.hellokoding.service.TinhThanhService;

@RestController
public class JsonController {

	@Autowired
	private DanhMucService danhMucService;
	@Autowired
	private DiaDiemService diaDiemService;
	@Autowired
	private MonAnService monAnService;
	
	@Autowired
	private TinhThanhService tinhThanhService;
	
	@RequestMapping(value="/tinhthanh", method = RequestMethod.GET, produces = "application/json")
	public List<TinhThanh> getAlltinhthanh(){
		return tinhThanhService.findAll();
	}
	
	@RequestMapping(value="/danhmuc", method = RequestMethod.GET, produces = "application/json")
	public List<DanhMuc> getAllDM(){
		return danhMucService.findAll();
	}
	
	@RequestMapping(value="/diadiem-{tinhthanh}", method = RequestMethod.GET, produces = "application/json")
	public List<DiaDiem> getDDTP(@PathVariable String tinhthanh){
		System.out.println("1 -" + tinhthanh);
		return diaDiemService.getDiaDiemTP(tinhthanh);
	}
	
	@RequestMapping(value="/diadiem1-{tinhthanh}-{danhmuc}", method = RequestMethod.GET, produces = "application/json")
	public List<DiaDiem> getDDTPDM(@PathVariable String tinhthanh,@PathVariable String danhmuc){
		System.out.println("1 -" + tinhthanh + "-" + danhmuc);
		return diaDiemService.getDiaDiemTPDM(tinhthanh,danhMucService.getDMfname(danhmuc));
	}
	
	@RequestMapping(value="/diadiem2-{tinhthanh}-{quan}", method = RequestMethod.GET, produces = "application/json")
	public List<DiaDiem> getDDQ(@PathVariable String tinhthanh, @PathVariable String quan){
		return diaDiemService.getDiaDiemQ(tinhthanh,quan);
	}
	
	@RequestMapping(value="/diadiem3-{tinhthanh}-{quan}-{danhmuc}", method = RequestMethod.GET, produces = "application/json")
	public List<DiaDiem> getDDQDM(@PathVariable String tinhthanh, @PathVariable String quan, @PathVariable String danhmuc){
		return diaDiemService.getDiaDiemQDM(tinhthanh,quan,danhMucService.getDMfname(danhmuc));
	}
	
	// Món ăn
	@RequestMapping(value="/monan-{tinhthanh}", method = RequestMethod.GET, produces = "application/json")
	public List<MonAn> getMATP(@PathVariable String tinhthanh){
		System.out.println("1 -" + tinhthanh);
		return monAnService.getMonAnTP(tinhthanh);
	}
	
	@RequestMapping(value="/monan1-{tinhthanh}-{danhmuc}", method = RequestMethod.GET, produces = "application/json")
	public List<MonAn> getMATPDM(@PathVariable String tinhthanh,@PathVariable String danhmuc){
		System.out.println("1 -" + tinhthanh + "-" + danhmuc);
		return monAnService.getMonAnTPDM(tinhthanh,danhMucService.getDMfname(danhmuc));
	}
	
	@RequestMapping(value="/monan2-{tinhthanh}-{quan}", method = RequestMethod.GET, produces = "application/json")
	public List<MonAn> getMAQ(@PathVariable String tinhthanh, @PathVariable String quan){
		return monAnService.getMonAnQ(tinhthanh,quan);
	}
	
	@RequestMapping(value="/monan3-{tinhthanh}-{quan}-{danhmuc}", method = RequestMethod.GET, produces = "application/json")
	public List<MonAn> getMAQDM(@PathVariable String tinhthanh, @PathVariable String quan, @PathVariable String danhmuc){
		return monAnService.getMonAnQDM(tinhthanh,quan,danhMucService.getDMfname(danhmuc));
	}
	
}
