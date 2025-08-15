package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.LoadMediaDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;

/* renamed from: d10  reason: default package */
public final /* synthetic */ class d10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int intValue;
        cu8 cu8;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                ArrayList arrayList = hm9.l;
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    return;
                } catch (Exception e) {
                    hm9.p("hm9", e.getMessage(), e);
                    return;
                }
            case 1:
                FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = (FrgDlgAudioTracksPicker) obj;
                a aVar = frgDlgAudioTracksPicker.I0;
                Class cls = FrgAttachVideo.class;
                FrgAttachVideo frgAttachVideo = (FrgAttachVideo) (aVar != null ? cls.cast(aVar) : cls.cast(frgDlgAudioTracksPicker.b0()));
                lze lze = (lze) frgDlgAudioTracksPicker.F1.get(i);
                frgAttachVideo.getClass();
                hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onAudioTrackSelected %s", lze);
                lj9 lj9 = frgAttachVideo.N1;
                if (lj9 != null) {
                    hm9.m("lj9", "selectAudioTrack %s", lze);
                    if (lj9.b2()) {
                        l20 l20 = lj9.y0;
                        if (!(l20 == null || (cu8 = lj9.x0) == null)) {
                            int i2 = lze.t0;
                            au8 au8 = lj9.s0;
                            au8.getClass();
                            au8.t(cu8, l20.r, new h75(i2, lze.s0, 5));
                        }
                        bq7 bq7 = (bq7) lj9.c;
                        if (bq7.f != null) {
                            u65 u65 = bq7.b;
                            u65.getClass();
                            hm9.m("u65", "selectAudioTrack: %s", lze);
                            u65.u();
                            lze lze2 = lze.u0;
                            kad kad = u65.b;
                            bf4 bf4 = (bf4) kad.a;
                            if (lze == lze2) {
                                ez7 ez7 = bf4.c;
                                if (ez7 != null && (intValue = ((Integer) kad.d(ez7).second).intValue()) >= 0) {
                                    pe4 b2 = bf4.b();
                                    SparseArray sparseArray = b2.M;
                                    Map map = (Map) sparseArray.get(intValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(intValue);
                                    }
                                    bf4.h(b2);
                                }
                            } else {
                                ez7 ez72 = bf4.c;
                                if (ez72 != null) {
                                    qe4 qe4 = new qe4(lze.s0, 0, new int[]{lze.t0});
                                    sze[] szeArr = ez72.c;
                                    int i3 = lze.Z;
                                    sze sze = szeArr[i3];
                                    pe4 b3 = bf4.b();
                                    b3.e(i3, sze, qe4);
                                    bf4.h(b3);
                                }
                            }
                        }
                    }
                }
                frgDlgAudioTracksPicker.f1(false, false);
                return;
            case 2:
                ((FrgDlgStopLiveLocation) obj).f1(false, false);
                return;
            case 3:
                LoadMediaDialog loadMediaDialog = (LoadMediaDialog) obj;
                a i0 = loadMediaDialog.i0(true);
                if (i0 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", loadMediaDialog.T0().getInt("ru.ok.tamtam.extra.SETTING_ID"));
                    if (i == 0) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 0);
                    } else if (i == 1) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", 1);
                    } else if (i == 2) {
                        intent.putExtra("ru.ok.tamtam.extra.RESULT_ITEM", -1);
                    }
                    i0.s0(loadMediaDialog.j0(), -1, intent);
                    return;
                }
                return;
            default:
                ((VideoQualityPickerDialog) obj).o1(mkf.a);
                return;
        }
    }
}
