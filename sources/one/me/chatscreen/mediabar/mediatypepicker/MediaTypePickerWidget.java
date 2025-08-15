package one.me.chatscreen.mediabar.mediatypepicker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "", "chatId", "(Ljava/lang/String;JLz84;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaTypePickerWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] Y;
    public final an9 X;
    public final fs a;
    public final fs b;
    public final je7 c;
    public final qm0 o;

    static {
        Class<MediaTypePickerWidget> cls = MediaTypePickerWidget.class;
        hob hob = new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oec = nec.a;
        Y = new bc7[]{hob, zr6.e(oec, cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), zr6.f(cls, "root", "getRoot()Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerButtonsView;", 0, oec)};
    }

    public MediaTypePickerWidget(String str, long j, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("chat_id", Long.valueOf(j))));
    }

    public final void h(int i, Bundle bundle) {
        if (i == 1) {
            pnf.o(m0().b.b, xl8.a);
        } else if (i == 2) {
            try {
                String str = o37.a;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                startActivityForResult(intent, 373);
                an9.g(this.X, wuc.CHAT_SYSTEM_FILE_VIEWER);
            } catch (ActivityNotFoundException unused) {
                wha wha = new wha((Widget) this);
                wha.h(z7.B(getContext(), jpc.F1));
                wha.i();
            }
        }
    }

    public final dm8 m0() {
        return (dm8) this.c.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: er7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: cme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: cme} */
    /* JADX WARNING: type inference failed for: r1v6, types: [er7] */
    /* JADX WARNING: type inference failed for: r1v8, types: [er7] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r0 = 371(0x173, float:5.2E-43)
            r1 = 0
            if (r9 == r0) goto L_0x0046
            r0 = 373(0x175, float:5.23E-43)
            if (r9 == r0) goto L_0x001e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected onActivityResult code "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MediaTypePickerWidget"
            defpackage.hm9.p(r9, r8, r1)
            goto L_0x0092
        L_0x001e:
            if (r11 == 0) goto L_0x0045
            android.net.Uri r9 = r11.getData()
            if (r9 != 0) goto L_0x0027
            goto L_0x0045
        L_0x0027:
            dm8 r8 = r8.m0()
            kotlinx.coroutines.internal.ContextScope r10 = r8.a
            je7 r11 = r8.t0
            java.lang.Object r11 = r11.getValue()
            kke r11 = (defpackage.kke) r11
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            cm8 r0 = new cm8
            r0.<init>(r9, r8, r1)
            r8 = 2
            defpackage.j47.T(r10, r11, r1, r0, r8)
            goto L_0x0092
        L_0x0045:
            return
        L_0x0046:
            r9 = -1
            if (r10 != r9) goto L_0x0072
            if (r11 != 0) goto L_0x004c
            goto L_0x0072
        L_0x004c:
            java.lang.String r9 = "ru.ok.tamtam.extra.LOCATION"
            java.io.Serializable r9 = r11.getSerializableExtra(r9)
            boolean r10 = r9 instanceof defpackage.er7
            if (r10 == 0) goto L_0x0059
            r1 = r9
            er7 r1 = (defpackage.er7) r1
        L_0x0059:
            if (r1 != 0) goto L_0x005d
            er7 r1 = defpackage.er7.Z
        L_0x005d:
            r3 = r1
            java.lang.String r9 = "ru.ok.tamtam.extra.LIVE"
            r0 = 0
            long r4 = r11.getLongExtra(r9, r0)
            java.lang.String r9 = "ru.ok.tamtam.extra.ZOOM"
            long r6 = r11.getLongExtra(r9, r0)
            cme r1 = new cme
            r2 = r1
            r2.<init>(r3, r4, r6)
        L_0x0072:
            if (r1 == 0) goto L_0x0092
            dm8 r8 = r8.m0()
            bm8 r8 = r8.b
            s35 r9 = r8.b
            zl8 r10 = new zl8
            long r2 = r1.c
            float r11 = (float) r2
            er7 r0 = r1.a
            long r1 = r1.b
            r10.<init>(r0, r11, r1)
            defpackage.pnf.o(r9, r10)
            wl8 r9 = defpackage.wl8.a
            s35 r8 = r8.b
            defpackage.pnf.o(r8, r9)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget.onActivityResult(int, int, android.content.Intent):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc7 bc7 = Y[2];
        return (tl8) this.o.getValue();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q0e q0e = m0().X;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(q0e, getViewLifecycleOwner().Q(), fg7), new mm8((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().Y, getViewLifecycleOwner().Q(), fg7), new nm8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Long.class, "chat_id");
        this.b = new fs(suc.class, Widget.ARG_SCOPE_ID);
        this.c = createViewModelLazy(dm8.class, new nj4(29, new lm8(this, 0)));
        this.o = binding(new lm8(this, 1));
        this.X = (an9) to2.a.getAccessor().c(an9.class);
    }
}
