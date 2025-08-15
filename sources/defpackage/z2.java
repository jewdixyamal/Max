package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* renamed from: z2  reason: default package */
public final class z2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) this.b;
                r48 r48 = mediaBarPreviewLayout.T0;
                if (!(r48 == null || editable == null)) {
                    ((ActLocalMedias) r48).m0().f.k = editable;
                }
                if (mediaBarPreviewLayout.X0) {
                    mediaBarPreviewLayout.B(mediaBarPreviewLayout.R0.f.b() > 0);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                eha eha = (eha) this.b;
                eha.o = editable;
                je7 je7 = eha.F0;
                if (je7.a()) {
                    View view = (View) je7.getValue();
                    int i = 0;
                    if (!(true ^ (editable == null || editable.length() == 0))) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                bha bha = eha.u0;
                if (bha != null) {
                    bha.I(editable);
                    return;
                }
                return;
            case 6:
                Object subSequence = editable != null ? editable.subSequence(0, editable.length()) : null;
                if (subSequence == null) {
                    subSequence = "";
                }
                ((m56) this.b).invoke(subSequence);
                return;
            default:
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        eaa eaa;
        String str;
        String e;
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                txa v0 = ((AbstractPickerScreen) obj).v0();
                String obj2 = charSequence != null ? charSequence.toString() : null;
                v0.getClass();
                if (obj2 == null) {
                    obj2 = "";
                }
                v0.t0.m((Object) null, obj2);
                return;
            case 1:
                bc7[] bc7Arr = LogsViewerScreen.Y;
                mv7 m0 = ((LogsViewerScreen) obj).m0();
                if (charSequence != null) {
                    m0.getClass();
                    if (!w9e.C0(charSequence)) {
                        m0.t0.o1(m0, mv7.v0[0], j47.S(m0.a, ((w9a) m0.c).b(), vx3.b, new lv7(m0, charSequence, (Continuation) null)));
                        m0.q();
                        return;
                    }
                }
                m0.getClass();
                m0.t0.o1(m0, mv7.v0[0], (Object) null);
                m0.s0.m((Object) null, nz4.a);
                return;
            case 2:
                bc7[] bc7Arr2 = LongValueBottomSheet.D0;
                LongValueBottomSheet longValueBottomSheet = (LongValueBottomSheet) obj;
                longValueBottomSheet.getClass();
                OneMeButton oneMeButton = (OneMeButton) longValueBottomSheet.C0.T0(longValueBottomSheet, LongValueBottomSheet.D0[4]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton.setEnabled(!z);
                return;
            case 3:
                return;
            case 4:
                if (i3 > 1) {
                    lea lea = (lea) obj;
                    if (!lea.s0 && (eaa = lea.c) != null && (str = eaa.a) != null) {
                        String valueOf = String.valueOf(charSequence);
                        kea phoneFormatterProvider = lea.getPhoneFormatterProvider();
                        if (!(phoneFormatterProvider == null || (e = phoneFormatterProvider.e(str, valueOf)) == null)) {
                            valueOf = e;
                        }
                        EditText editText = lea.w0;
                        editText.removeTextChangedListener(lea.x0);
                        lea.setText(valueOf);
                        editText.addTextChangedListener(lea.x0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((o0d) obj).onTextChanged(charSequence);
                return;
            case 8:
                bc7[] bc7Arr3 = ServerHostBottomSheet.G0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                OneMeButton oneMeButton2 = (OneMeButton) serverHostBottomSheet.F0.T0(serverHostBottomSheet, ServerHostBottomSheet.G0[4]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton2.setEnabled(!z);
                return;
            default:
                bc7[] bc7Arr4 = ServerPortBottomSheet.B0;
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj;
                serverPortBottomSheet.getClass();
                OneMeButton oneMeButton3 = (OneMeButton) serverPortBottomSheet.A0.T0(serverPortBottomSheet, ServerPortBottomSheet.B0[1]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton3.setEnabled(!z);
                return;
        }
    }
}
