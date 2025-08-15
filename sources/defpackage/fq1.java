package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: fq1  reason: default package */
public abstract class fq1 implements mb7, Serializable {
    public static final Object NO_RECEIVER = eq1.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient mb7 reflected;
    private final String signature;

    public fq1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public mb7 compute() {
        mb7 mb7 = this.reflected;
        if (mb7 != null) {
            return mb7;
        }
        mb7 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract mb7 computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public ob7 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return nec.a(cls);
        }
        nec.a.getClass();
        return new xoa(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract mb7 getReflected();

    public ec7 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public fc7 getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
