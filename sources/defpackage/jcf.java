package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: jcf  reason: default package */
public abstract class jcf {
    public final us a;
    public final us b;
    public final us c;

    public jcf(us usVar, us usVar2, us usVar3) {
        this.a = usVar;
        this.b = usVar2;
        this.c = usVar3;
    }

    public abstract kcf a();

    public final Class b(Class cls) {
        String name = cls.getName();
        us usVar = this.c;
        Class cls2 = (Class) usVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        usVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        us usVar = this.a;
        Method method = (Method) usVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<jcf> cls = jcf.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        usVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        us usVar = this.b;
        Method method = (Method) usVar.get(name);
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, jcf.class});
        usVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((kcf) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((kcf) this).e.readParcelable(kcf.class.getClassLoader());
    }

    public final lcf h() {
        String readString = ((kcf) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (lcf) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((kcf) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((kcf) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(lcf lcf) {
        if (lcf == null) {
            ((kcf) this).e.writeString((String) null);
            return;
        }
        try {
            ((kcf) this).e.writeString(b(lcf.getClass()).getName());
            kcf a2 = a();
            try {
                d(lcf.getClass()).invoke((Object) null, new Object[]{lcf, a2});
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(lcf.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
