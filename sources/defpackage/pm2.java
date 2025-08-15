package defpackage;

/* renamed from: pm2  reason: default package */
public final class pm2 {
    public final e52 a;
    public final es8 b;
    public final es8 c;
    public final zof d;
    public final k29 e;
    public final nr2 f;

    public pm2(e52 e52, es8 es8, es8 es82, zof zof, k29 k29, nr2 nr2) {
        this.a = e52;
        this.b = es8;
        this.c = es82;
        this.d = zof;
        this.e = k29;
        this.f = nr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm2)) {
            return false;
        }
        pm2 pm2 = (pm2) obj;
        return tpa.f(this.a, pm2.a) && tpa.f(this.b, pm2.b) && tpa.f(this.c, pm2.c) && this.d == pm2.d && tpa.f(this.e, pm2.e) && tpa.f(this.f, pm2.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingMessage=" + this.b + ", outgoingMessage=" + this.c + ", messageViewStatus=" + this.d + ", messageTextLayoutRepository=" + this.e + ", chatTheme=" + this.f + ")";
    }
}
