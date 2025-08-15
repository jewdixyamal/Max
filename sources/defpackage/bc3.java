package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bc3  reason: default package */
public final /* synthetic */ class bc3 implements gpb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(zr6.i("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(zr6.i("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(wg0.i("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(wg0.i("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            case 2:
                return new jt6((fl5) this.b);
            default:
                return (ScheduledExecutorService) ((k56) this.b).invoke();
        }
    }
}
