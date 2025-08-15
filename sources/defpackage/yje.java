package defpackage;

/* renamed from: yje  reason: default package */
public final class yje extends RuntimeException {
    public final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yje(String str, String str2) {
        super(str);
        this.a = str2;
    }

    public final String getLocalizedMessage() {
        return this.a;
    }
}
