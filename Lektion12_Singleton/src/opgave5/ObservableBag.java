//package opgave5;
//
//import java.util.*;
//import java.util.function.Consumer;
//
//public class ObservableBag implements Bag,Iterable{
//    private final Map<String, Integer> contents = new HashMap();
//    private final ArrayList<Observer> observers = new ArrayList<>();
//
//    public ObservableBag(){
//    }
//
//    @Override
//    public void add(String s) {
//        if(contents.containsKey(s)){
//            contents.replace(s, contents.get(s) + 1);
//        }else{
//            contents.put(s,1);
//        }
//    }
//
//    @Override
//    public void remove(String s) {
//        if(contents.get(s) == 1 ){
//            contents.remove(s);
//        }else{
//            contents.replace(s,contents.get(s) -1 );
//        }
//    }
//
//    @Override
//    public int getCount(String s) {
//        return  contents.get(s);
//    }
//
////    @Override
////    public void registerObserver(Observer o) {
////        if(!observers.contains(o)){
////            observers.add(o);
////        }
////    }
////
////    @Override
////    public void removeObserver(Observer o) {
////        observers.remove(o);
////    }
////
////    @Override
////    public Iterator<String> iterator() {
////        return contents.keySet().iterator();
////    }
//
//}
