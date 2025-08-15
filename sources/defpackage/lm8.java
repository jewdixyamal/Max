package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: lm8  reason: default package */
public final /* synthetic */ class lm8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaTypePickerWidget b;

    public /* synthetic */ lm8(MediaTypePickerWidget mediaTypePickerWidget, int i) {
        this.a = i;
        this.b = mediaTypePickerWidget;
    }

    public final Object invoke() {
        boolean z = true;
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaTypePickerWidget.Y;
                bc7 bc7 = bc7Arr[1];
                bc7 bc72 = bc7Arr[0];
                return new dm8((bm8) mediaTypePickerWidget.m82getSharedViewModelcp94BC8(((suc) mediaTypePickerWidget.b.a(mediaTypePickerWidget)).a, bm8.class, (k56) null).getValue(), ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue());
            default:
                bc7[] bc7Arr2 = MediaTypePickerWidget.Y;
                tl8 tl8 = new tl8(mediaTypePickerWidget.getContext());
                dm8 m0 = mediaTypePickerWidget.m0();
                m0.getClass();
                kl7 l = j1e.l();
                l.add(gm8.a);
                e52 e52 = (e52) ((jz2) ((iy2) m0.s0.getValue())).m(m0.c).a.getValue();
                je7 je7 = m0.Z;
                if (e52 != null) {
                    boolean z2 = e52.b.a != 0;
                    if (!e52.M() || e52.H()) {
                        z = false;
                    }
                    qyc qyc = (qyc) ((y7d) je7.getValue());
                    qyc.getClass();
                    if (qyc.q(PmsKey.f86moneytransferbotid, 0) != 0 && z && z2) {
                        l.add(im8.a);
                    }
                }
                qyc qyc2 = (qyc) ((y7d) je7.getValue());
                qyc2.getClass();
                if (qyc2.n(PmsKey.f111sendlocationenabled, false)) {
                    l.add(hm8.a);
                }
                l.add(em8.a);
                l.add(fm8.a);
                tl8.setState(j1e.d(l));
                tl8.setOnClickListener(new om8(1, mediaTypePickerWidget.m0(), dm8.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0, 0));
                if (tl8.isAttachedToWindow()) {
                    tl8.setPadding(tl8.getPaddingLeft(), tl8.getPaddingTop(), tl8.getPaddingRight(), tu0.G((x6g.f((View) null, tl8.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * fk4.d().getDisplayMetrics().density));
                } else {
                    tl8.addOnAttachStateChangeListener(new o50(tl8, 5, tl8));
                }
                return tl8;
        }
    }
}
