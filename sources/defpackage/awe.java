package defpackage;

/* renamed from: awe  reason: default package */
public enum awe {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public final String a;

    /* access modifiers changed from: public */
    awe(String str) {
        this.a = str;
    }
}
