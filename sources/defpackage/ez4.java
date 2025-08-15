package defpackage;

/* renamed from: ez4  reason: default package */
public final class ez4 implements nz6 {
    public final boolean a;

    public ez4(boolean z) {
        this.a = z;
    }

    public final tq9 b() {
        return null;
    }

    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return rh4.m(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
