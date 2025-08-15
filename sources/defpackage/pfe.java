package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pfe  reason: default package */
public final class pfe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pfe(cge cge, Continuation continuation) {
        super(2, continuation);
        this.Z = cge;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pfe) n((v6f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pfe pfe = new pfe(this.Z, continuation);
        pfe.Y = obj;
        return pfe;
    }

    public final Object o(Object obj) {
        mn5 mn5;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            v6f v6f = (v6f) this.Y;
            if (v6f.a()) {
                String str = this.Z.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, "No need for uploading due it already finished", (Throwable) null);
                }
                return new qn5(3, v6f);
            }
            String str2 = this.Z.b;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, str2, "Requested upload to server", (Throwable) null);
            }
            cge cge = this.Z;
            this.X = 1;
            cge.getClass();
            mn5 = od2.w(new zn5(od2.D(new zn5(new yfe(new zn5(new yfe(new yfe(new qn5(3, v6f), cge, 0), cge, 1), new v59(2, cge, cge.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), 5), cge, 2), new v59(2, cge, cge.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), new shb(2, cge, cge.class, "uploadFile", "uploadFile(Lone/me/sdk/transfer/domain/Upload;)Lkotlinx/coroutines/flow/Flow;", 4, 21)), new bge(cge, (Continuation) null), 5), new ai0(28));
            if (mn5 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
            mn5 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return mn5;
    }
}
