package possacode.workshopdto.service;

import java.util.List;

public interface AbstractService <T>{
     public T  save(T t);

     public List<T> findAll();

     public T findById(Integer id);

     public void deleteById(Integer id);
}
