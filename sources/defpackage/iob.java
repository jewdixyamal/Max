package defpackage;

/* renamed from: iob  reason: default package */
public abstract class iob extends fq1 implements bc7 {
    private final boolean syntheticJavaProperty;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iob(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    public mb7 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iob) {
            iob iob = (iob) obj;
            return getOwner().equals(iob.getOwner()) && getName().equals(iob.getName()) && getSignature().equals(iob.getSignature()) && tpa.f(getBoundReceiver(), iob.getBoundReceiver());
        } else if (obj instanceof bc7) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        mb7 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public bc7 getReflected() {
        if (!this.syntheticJavaProperty) {
            mb7 compute = compute();
            if (compute != this) {
                return (bc7) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
