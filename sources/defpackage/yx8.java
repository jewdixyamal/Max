package defpackage;

/* renamed from: yx8  reason: default package */
public final class yx8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public yx8(String str, boolean z, k56 k56, k56 k562) {
        this.a = 0;
        this.c = str;
        this.b = z;
        tu0.r(3, k56);
        tu0.r(3, k562);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                o84.Z.getClass();
                StringBuilder sb = new StringBuilder("MessageText(text='");
                sb.append("***");
                sb.append("', bundled=");
                return au1.j(sb, this.b, ")");
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yx8(String str, boolean z, int i) {
        this(str, z, new xx8(str, 0), new xx8(str, 0));
        this.a = i;
        switch (i) {
            case 2:
                this.c = str;
                this.b = z;
                return;
            default:
                return;
        }
    }

    public yx8(String str, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = str;
    }
}
