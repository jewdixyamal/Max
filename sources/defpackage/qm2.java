package defpackage;

/* renamed from: qm2  reason: default package */
public final class qm2 {
    public final e52 a;
    public final es8 b;
    public final es8 c;
    public final es8 d;
    public final zof e;
    public final k29 f;
    public final nr2 g;

    public qm2(e52 e52, es8 es8, es8 es82, es8 es83, zof zof, k29 k29, nr2 nr2) {
        this.a = e52;
        this.b = es8;
        this.c = es82;
        this.d = es83;
        this.e = zof;
        this.f = k29;
        this.g = nr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm2)) {
            return false;
        }
        qm2 qm2 = (qm2) obj;
        return tpa.f(this.a, qm2.a) && tpa.f(this.b, qm2.b) && tpa.f(this.c, qm2.c) && tpa.f(this.d, qm2.d) && this.e == qm2.e && tpa.f(this.f, qm2.f) && tpa.f(this.g, qm2.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingFirstMessage=" + this.b + ", incomingSecondMessage=" + this.c + ", outgoingMessage=" + this.d + ", messageViewStatus=" + this.e + ", messageTextLayoutRepository=" + this.f + ", chatTheme=" + this.g + ")";
    }
}
