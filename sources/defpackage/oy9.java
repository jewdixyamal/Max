package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* renamed from: oy9  reason: default package */
public final class oy9 extends idg implements xr6 {
    public final Object d;

    public oy9(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.d = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [cdg, xr6] */
    public static xr6 K0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof xr6 ? (xr6) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object L0(xr6 xr6) {
        if (xr6 instanceof oy9) {
            return ((oy9) xr6).d;
        }
        IBinder asBinder = xr6.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            fp3.n(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(zr6.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
    }
}
