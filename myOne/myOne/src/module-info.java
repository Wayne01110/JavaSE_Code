import com.MyService;
import com.Wayne_03.impl.Czxy;
import com.Wayne_03.impl.itheima;

module myOne {
    exports com.wayne0421;
    exports com.Wayne_03.impl;
    exports com;

//    provides MyService with itheima;
    provides MyService with itheima,Czxy;
}