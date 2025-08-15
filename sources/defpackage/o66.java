package defpackage;

/* renamed from: o66  reason: default package */
public abstract class o66 extends fq1 implements n66, pb7 {
    private final int arity;
    private final int flags;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o66(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    public mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o66) {
            o66 o66 = (o66) obj;
            return getName().equals(o66.getName()) && getSignature().equals(o66.getSignature()) && this.flags == o66.flags && this.arity == o66.arity && tpa.f(getBoundReceiver(), o66.getBoundReceiver()) && tpa.f(getOwner(), o66.getOwner());
        } else if (obj instanceof pb7) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        mb7 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public pb7 getReflected() {
        mb7 compute = compute();
        if (compute != this) {
            return (pb7) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
