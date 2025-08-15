package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import one.me.profile.ProfileScreen;

/* renamed from: olb  reason: default package */
public final /* synthetic */ class olb implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qlb b;
    public final /* synthetic */ cjb c;

    public /* synthetic */ olb(cjb cjb, qlb qlb) {
        this.c = cjb;
        this.b = qlb;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long j = ((uib) this.c).a.a;
                ((ProfileScreen) this.b.X).getClass();
                ckb.c.a2(j);
                return;
            default:
                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                profileScreen.getClass();
                StringBuilder sb = new StringBuilder("ID #");
                long j2 = ((xib) this.c).a;
                String k = zr6.k(sb, j2, " скопирован в буфер обмена");
                ((ClipboardManager) profileScreen.requireActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(k, String.valueOf(j2)));
                wha wha = (wha) xcb.a.getAccessor().d(wha.class).getValue();
                wha.h(k);
                uia uia = wha.b;
                wha.b = uia.a(uia, (oia) null, (CharSequence) null, (CharSequence) null, (tia) null, eia.a(uia.X, 2, 0, 0, 6), (iia) null, 47);
                wha.i();
                return;
        }
    }

    public /* synthetic */ olb(qlb qlb, cjb cjb) {
        this.b = qlb;
        this.c = cjb;
    }
}
