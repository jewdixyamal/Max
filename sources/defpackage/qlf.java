package defpackage;

/* renamed from: qlf  reason: default package */
public final class qlf {
    public final String a;
    public final long b;
    public final String c;

    public qlf(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUploadInfo{url='");
        sb.append(this.a);
        sb.append("', videoId=");
        sb.append(this.b);
        sb.append(", token='");
        sb.append(!oag.t(this.c));
        sb.append("'}");
        return sb.toString();
    }
}
