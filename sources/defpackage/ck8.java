package defpackage;

/* renamed from: ck8  reason: default package */
public final /* synthetic */ class ck8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ ik8 c;
    public final /* synthetic */ yn7 o;

    public /* synthetic */ ck8(jn jnVar, ik8 ik8, yn7 yn7, pc8 pc8, int i) {
        this.a = i;
        this.b = jnVar;
        this.c = ik8;
        this.o = yn7;
        this.X = pc8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                this.c.x(jnVar.b, (yj8) jnVar.c, this.o, this.X);
                return;
            case 1:
                jn jnVar2 = this.b;
                this.c.t(jnVar2.b, (yj8) jnVar2.c, this.o, this.X);
                return;
            default:
                jn jnVar3 = this.b;
                this.c.r(jnVar3.b, (yj8) jnVar3.c, this.o, this.X);
                return;
        }
    }
}
