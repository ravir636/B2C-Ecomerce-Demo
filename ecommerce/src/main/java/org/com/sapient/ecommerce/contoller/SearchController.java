package org.com.sapient.ecommerce.contoller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.com.sapient.ecommerce.model.Product;
import org.com.sapient.ecommerce.model.Product.Size;
import org.com.sapient.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@Api(value="B2C ecommerce", tags= {"Search products from Ecommerce site"}, consumes="application/json")
public class SearchController {

private ProductService productService;

@ApiOperation(value = "Search a Products Catalogs by Defferent-Differnt Parameters")
@ApiResponses(value = {
    @ApiResponse(code = 200, message = "Successfully retrieved list"),
    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
})
@GetMapping("/allProducts")
public List<Product> allProducts(@RequestParam HashMap<String,String> param){
	//HashMap<String,String> hm=(HashMap<String, String>) param.entrySet();
	if(!param.isEmpty()) {
	List<Product> list=new ArrayList<>();
	if(param.containsKey("brand"))
	list.addAll(productService.byBrand(param.get("brand")));
	if(param.containsKey("size"))
	list.addAll(productService.bySize(param.get("size")));
	if(param.containsKey("color"))
	list.addAll(productService.byColor(param.get("color")));
	return list.stream().distinct().collect(Collectors.toList());
	}
	else
	return productService.getAllProductData();
}
//@ApiOperation(value = "Inncorrect Url")
//@GetMapping("**")
//public String error() {
//	return "Incorrect URL Please Use Correct URL";
//}

}
