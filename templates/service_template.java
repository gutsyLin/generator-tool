
import java.util.List;

public interface ${service_name} {
    
    boolean add(${model_class_name} ${model_var});
    
    boolean modify(${model_class_name} ${model_var});
    
    boolean delete(${model_class_name} ${model_var});
    
    List<${model_class_name}> find(${model_class_name} condition);
    
}
