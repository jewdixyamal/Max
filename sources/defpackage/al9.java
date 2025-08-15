package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.nano.Protos;

/* renamed from: al9  reason: default package */
public final /* synthetic */ class al9 implements tj3 {
    public final /* synthetic */ int a;

    public /* synthetic */ al9(int i) {
        this.a = i;
    }

    public final void accept(Object obj) {
        Parcelable parcelable = null;
        switch (this.a) {
            case 0:
                zj9 zj9 = (zj9) obj;
                zj9.getClass();
                hm9.m("zj9", "onCropButtonClicked()", new Object[0]);
                up7 up7 = zj9.X;
                if (up7 != null && up7.a == 1 && !up7.d()) {
                    zj9.v0.f("LOCAL_MEDIA_CROP");
                    File a2 = zj9.x0.a("jpg");
                    String a3 = zj9.X.a();
                    awa awa = zj9.u0;
                    Uri uri = awa != null ? awa.b : null;
                    Uri uri2 = awa != null ? awa.a : null;
                    if (uri2 != null && uri == null) {
                        a3 = uri2.getPath();
                    }
                    awa awa2 = zj9.u0;
                    nz3 nz3 = awa2 != null ? awa2.c : null;
                    ov4 ov4 = awa2 != null ? awa2.o : null;
                    if ((nz3 == null && uri != null) || !(nz3 == null || ov4 == null)) {
                        a3 = uri.getPath();
                    }
                    Uri parse = Uri.parse(a3);
                    hm9.m("zj9", "startCrop()", new Object[0]);
                    awa awa3 = zj9.u0;
                    if (awa3 != null) {
                        parcelable = awa3.X;
                    }
                    if (parcelable != null) {
                        hm9.m("zj9", "startCrop() media has overlay, processing", new Object[0]);
                        bn0 bn0 = zj9.y0;
                        bn0.getClass();
                        u00 u00 = new u00((Object) bn0, (Object) parse, (Object) parcelable, 20);
                        iq1 iq1 = new iq1(new y98((Object) zj9, 14, (Object) a2), 2, new vj9(zj9, 0));
                        Objects.requireNonNull(iq1, "observer is null");
                        try {
                            nqd nqd = new nqd((erd) iq1);
                            iq1.c(nqd);
                            try {
                                u00.j(nqd);
                                return;
                            } catch (Throwable th) {
                                c37.B(th);
                                nqd.onError(th);
                                return;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (Throwable th2) {
                            c37.B(th2);
                            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                            nullPointerException.initCause(th2);
                            throw nullPointerException;
                        }
                    } else {
                        ((ActLocalMedias) zj9.c).s0(parse, a2, nz3);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((zj9) obj).a2();
                return;
            case 2:
                zj9 zj92 = (zj9) obj;
                zj92.getClass();
                hm9.k("zj9", "onTrimButtonClicked");
                up7 up72 = zj92.X;
                if (up72 != null && up72.b()) {
                    String str = zj92.X.c;
                    ref ref = zj92.t0;
                    float f = ref.b;
                    float f2 = (float) zj92.s0;
                    ActLocalMedias actLocalMedias = (ActLocalMedias) zj92.c;
                    actLocalMedias.getClass();
                    Uri parse2 = Uri.parse(str);
                    Intent intent = new Intent(actLocalMedias, ActTrimVideo.class);
                    intent.putExtra("ru.ok.tamtam.extra.VIDEO_URI", parse2);
                    intent.putExtra("ru.ok.tamtam.extra.START_POSITION", (long) (f * f2));
                    intent.putExtra("ru.ok.tamtam.extra.END_POSITION", (long) (ref.c * f2));
                    intent.putExtra("ru.ok.tamtam.extra.MUTE", ref.d);
                    actLocalMedias.startActivityForResult(intent, 1);
                    return;
                }
                return;
            case 3:
                zj9 zj93 = (zj9) obj;
                up7 up73 = zj93.X;
                if (up73 != null && up73.a == 1 && !up73.d()) {
                    awa awa4 = zj93.u0;
                    Parcelable parcelable2 = awa4 != null ? awa4.o : null;
                    up7 up74 = zj93.X;
                    if (!(awa4 == null || awa4.X == null)) {
                        parcelable = parcelable2;
                    }
                    Uri a4 = awa.a(awa4, up74);
                    ActLocalMedias actLocalMedias2 = (ActLocalMedias) zj93.c;
                    actLocalMedias2.getClass();
                    Class<ActPhotoEditor> cls = ActPhotoEditor.class;
                    if (a4 == null) {
                        Intent intent2 = new Intent(actLocalMedias2, cls);
                        intent2.putExtra("photo_editor:is_drawing", true);
                        if (parcelable != null) {
                            intent2.putExtra("photo_editor:editor_state", parcelable);
                        }
                        intent2.putExtra("photo_editor:draw_sticker_enabled", false);
                        actLocalMedias2.startActivityForResult(intent2, 3);
                        return;
                    }
                    Intent intent3 = new Intent(actLocalMedias2, cls);
                    intent3.putExtra("photo_editor:background_uri", a4);
                    if (parcelable != null) {
                        intent3.putExtra("photo_editor:editor_state", parcelable);
                    }
                    intent3.putExtra("photo_editor:draw_sticker_enabled", false);
                    actLocalMedias2.startActivityForResult(intent3, 3);
                    return;
                }
                return;
            case 4:
                zj9 zj94 = (zj9) obj;
                zj94.getClass();
                hm9.k("zj9", "On mute button clicked");
                ref ref2 = zj94.t0;
                boolean z = ref2.d;
                boolean z2 = !z;
                i20 a5 = ref2.a();
                a5.d = z2;
                zj94.t0 = a5.a();
                zj94.c2();
                zj94.d2(new wj9(z2));
                tj9 tj9 = zj94.c;
                if (tj9 != null) {
                    ((ActLocalMedias) tj9).p0(z, true);
                }
                zj94.v0.d(z2 ? 1 : 0, "MUTE_VIDEO_BEFORE_SEND");
                return;
            case 5:
                ((ol9) obj).V0();
                return;
            case 6:
                ((ol9) obj).J1();
                return;
            case 7:
                ((ol9) obj).I1();
                return;
            case 8:
                hk9 hk9 = (hk9) obj;
                hk9.o.f("ACTION_LOCAL_MEDIA_TRIM_APPLY");
                nl9 nl9 = (nl9) ((kk9) hk9.b);
                AppCompatImageButton appCompatImageButton = nl9.C0;
                tg tgVar = nl9.Z;
                tgVar.g(appCompatImageButton);
                tgVar.i(nl9.D0);
                j47.l0((ViewGroup) ((View) nl9.c));
                long j = hk9.s0;
                FrgTrimVideo frgTrimVideo = hk9.c;
                frgTrimVideo.getClass();
                new q1a(1, new x72((Object) frgTrimVideo, (Object) hk9.X, j, 6)).m(muc.a()).i(ce.a()).k(new iq1(new gk9(hk9, 1), 2, new jj9(13)));
                return;
            case 9:
                ((hk9) obj).pause();
                return;
            case 10:
                hk9 hk92 = (hk9) obj;
                int i = (hk92.s0 > 0 ? 1 : (hk92.s0 == 0 ? 0 : -1));
                long j2 = hk92.Z;
                if (i != 0 || hk92.t0 != j2) {
                    hk92.a2();
                    hk92.s0 = 0;
                    hk92.t0 = j2;
                    nl9 nl92 = (nl9) ((kk9) hk92.b);
                    nl92.y0.setStartPosition(0);
                    nl92.y0.setEndPosition(hk92.t0);
                    nl92.y0.setPointerPosition(hk92.s0);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    nl92.w0.setText(ay7.l(timeUnit.toSeconds(hk92.s0)));
                    nl92.x0.setText(ay7.l(timeUnit.toSeconds(hk92.t0)));
                    ((bq7) hk92.Y).q(hk92.s0);
                    hk92.c2();
                    return;
                }
                return;
            case 11:
                FrgTrimVideo frgTrimVideo2 = ((hk9) obj).c;
                frgTrimVideo2.r1();
                frgTrimVideo2.e1();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                hk9 hk93 = (hk9) obj;
                ((bq7) hk93.Y).o();
                cqc.b(hk93.x0);
                o0a k = qy9.k(30, 30, TimeUnit.MILLISECONDS, ce.a());
                sd7 sd7 = new sd7(new gk9(hk93, 0), ft.f, ft.d);
                k.a(sd7);
                hk93.x0 = sd7;
                return;
            case 13:
                hk9 hk94 = (hk9) obj;
                boolean z3 = !hk94.y0;
                hk94.y0 = z3;
                ((nl9) ((kk9) hk94.b)).C(z3, ((bq7) hk94.Y).k());
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                qv4 qv4 = ((zva) obj).b;
                ArrayList arrayList = qv4.d;
                if (!arrayList.isEmpty()) {
                    s9 s9Var = (s9) wg0.f(arrayList, 1);
                    uv4 uv4 = qv4.a;
                    s9Var.a(uv4);
                    arrayList.remove(s9Var);
                    qv4.e.add(s9Var);
                    uv4.invalidate();
                    qv4.b();
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((ActPhotoEditor) ((zva) obj).c).j0();
                return;
            case 16:
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) ((zva) obj).c;
                if (((Boolean) actPhotoEditor.Y0.getValue()).booleanValue()) {
                    actPhotoEditor.k0((ng4) null);
                    return;
                } else {
                    ScheduledSendPickerDialogFragment.q1("ru.ok.messages.photoeditor.ActPhotoEditor", actPhotoEditor.S());
                    return;
                }
            case LangUtils.HASH_SEED /*17*/:
                ActPhotoEditor actPhotoEditor2 = (ActPhotoEditor) ((zva) obj).c;
                actPhotoEditor2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.k2);
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.n2);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.X0(bundle);
                confirmationDialog.k1(actPhotoEditor2.S(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
                return;
            case 18:
                zva zva = (zva) obj;
                qv4 qv42 = zva.b;
                boolean z4 = !qv42.a().o;
                cwa cwa = zva.e;
                cwa.getClass();
                cwa cwa2 = new cwa(cwa.a, cwa.b, cwa.c, cwa.o, z4, cwa.Y, cwa.Z);
                zva.e = cwa2;
                zva.a.a(cwa2);
                qv42.a.setDrawStickerEnabled(z4);
                zva.d.f(qv42, qv42.a(), false);
                ActPhotoEditor actPhotoEditor3 = (ActPhotoEditor) zva.c;
                if (z4) {
                    if (actPhotoEditor3.X0 == null) {
                        actPhotoEditor3.X0 = new gaa((Object) ((y8a) ((ed3) actPhotoEditor3.K0.b)).b());
                    }
                    ((ad) actPhotoEditor3.X0.a).f("DRAW_AS_STICKER_TAP");
                    return;
                }
                if (actPhotoEditor3.X0 == null) {
                    actPhotoEditor3.X0 = new gaa((Object) ((y8a) ((ed3) actPhotoEditor3.K0.b)).b());
                }
                ((ad) actPhotoEditor3.X0.a).f("DRAW_REGULAR_TAP");
                return;
            case 19:
                ((lc0) obj).d = Integer.valueOf(adc.k0.d);
                return;
            case 20:
                Uri uri3 = (Uri) obj;
                return;
            default:
                Throwable th3 = (Throwable) obj;
                hm9.p("VideoMessageCameraEffect", "Failed init camera effect due to " + th3.getLocalizedMessage(), th3);
                return;
        }
    }
}
