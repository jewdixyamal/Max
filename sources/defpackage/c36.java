package defpackage;

import android.media.MediaDrm;

/* renamed from: c36  reason: default package */
public final /* synthetic */ class c36 implements MediaDrm.OnEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c36(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        switch (this.a) {
            case 0:
                ((f36) this.b).getClass();
                cy cyVar = ((aa4) ((sy4) this.c).b).y;
                cyVar.getClass();
                cyVar.obtainMessage(i, bArr).sendToTarget();
                return;
            default:
                ((f36) this.b).getClass();
                cy cyVar2 = ((ba4) ((wd6) this.c).b).y;
                cyVar2.getClass();
                cyVar2.obtainMessage(i, bArr).sendToTarget();
                return;
        }
    }
}
