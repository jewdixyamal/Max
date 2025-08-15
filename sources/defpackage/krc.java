package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;

/* renamed from: krc  reason: default package */
public final class krc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ SaveToGalleryDialog Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public krc(SaveToGalleryDialog saveToGalleryDialog, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = saveToGalleryDialog;
        this.Z = str;
        this.s0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((krc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new krc(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        SaveToGalleryDialog saveToGalleryDialog = this.Y;
        if (i == 0) {
            od2.a0(obj);
            qrc qrc = new qrc((uuc) ((y8a) (saveToGalleryDialog.b0() != null ? vl.b() : vl.b())).getAccessor().c(uuc.class), ((w9a) ((kke) ((y8a) ((ed3) saveToGalleryDialog.E1.b)).getAccessor().c(kke.class))).b(), (qra) ((y8a) (saveToGalleryDialog.b0() != null ? vl.b() : vl.b())).getAccessor().c(qra.class));
            this.X = 1;
            obj = qrc.b(this.Z, this.s0, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        saveToGalleryDialog.o1(((Boolean) obj).booleanValue());
        return e5f.a;
    }
}
