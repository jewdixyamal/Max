package defpackage;

/* renamed from: sr0  reason: default package */
public abstract class sr0 {
    public boolean canRepeat() {
        return true;
    }

    public dl intoParam(String str) {
        return intoParam(new qr0(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(kb7 kb7);

    public final dl intoParam(qr0 qr0) {
        return new rr0(qr0, this);
    }
}
