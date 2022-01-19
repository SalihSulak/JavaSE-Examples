package salihsulak.northwind.business.abstracts;

import java.util.List;


import salihsulak.northwind.core.utilities.results.DataResult;
import salihsulak.northwind.core.utilities.results.Result;
import salihsulak.northwind.entities.concretes.Product;

public interface ProductService {
		DataResult<List<Product>> getAll();
		Product getById(int id);
		Result add(Product product);
}
