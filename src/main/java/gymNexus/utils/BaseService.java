package gymNexus.utils;

public interface BaseService <T,ID>{
    BaseCrudRepository getRepository();
}
