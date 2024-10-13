package gymNexus.utils;

import org.hibernate.service.spi.ServiceException;

import java.lang.reflect.Field;
import java.util.List;

public class ValidateMetodsUtils {

    public static <T> void validateFieldsNonNull(T entity, List<String> fields){
        fields.forEach(field -> {
            try{
                //Reflection para acessar o campo
                Field declaredField = entity.getClass().getDeclaredField(field);
                declaredField.setAccessible(true);
                Object value = declaredField.get(entity);

                if(field instanceof String){
                    if(CollectionMetodsUtils.isStringEmpty((String) value)){
                        throw new ServiceException("O campo " + field + " devera ser informado!");
                    }
                }else{
                    if(value == null){
                        throw new ServiceException("O campo " + field + " devera ser informado!");
                    }
                }
            }catch (Exception e ){
                throw new RuntimeException("Erro para acessar o campo" + field, e);
            }
        });
    }
}
