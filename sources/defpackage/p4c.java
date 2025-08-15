package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: p4c  reason: default package */
public final /* synthetic */ class p4c implements qj3, ru0, b66, eqc, pj3, bvc, b7b {
    public final /* synthetic */ int a;

    public /* synthetic */ p4c(int i) {
        this.a = i;
    }

    public void a() {
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                int i = RangeSeekBarView.Q0;
                hm9.p("ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView", "TimeLineView error occurred", (Throwable) obj);
                return;
            case 8:
                hm9.p("k9c", "clearRecentSearch: failed", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                hm9.p("cqc", "async failed", (Throwable) obj);
                return;
            case 13:
                w4d w4d = cqc.a;
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Throwable th = (Throwable) obj;
                hm9.p("nd7", th.getMessage(), th);
                return;
            case LangUtils.HASH_SEED:
                ((zqc) obj).b.release();
                return;
            case 18:
                ((arc) obj).b.release();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ((j10) obj).k = -1.0f;
                return;
            case 25:
                j10 j10 = (j10) obj;
                j10.i = d20.X;
                j10.k = -1.0f;
                return;
            case 27:
                hm9.p("o2e", "putSticker: failed", (Throwable) obj);
                return;
            default:
                hm9.p("o2e", "storeSections: failed", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        Object j3e;
        boolean z = false;
        switch (this.a) {
            case 2:
                return Long.valueOf(((uj3) obj).n());
            case 3:
                return new q9c((e52) obj, (uj3) null);
            case 4:
                return qy9.j(((e52) obj).j());
            case 5:
                return new q9c((e52) null, (uj3) obj);
            case 6:
                return qy9.j(((e52) obj).j());
            case 7:
                q9c q9c = (q9c) obj;
                e52 e52 = q9c.a;
                uj3 uj3 = q9c.b;
                return uj3 != null ? new kzc(4, (String) null, Collections.emptyList(), (e52) null, uj3, (fs8) null, 0, (vpb) null) : e52.I() ? new kzc(2, (String) null, Collections.emptyList(), e52, (uj3) null, (fs8) null, 0, (vpb) null) : new kzc(1, (String) null, Collections.emptyList(), e52, (uj3) null, (fs8) null, 0, (vpb) null);
            case 9:
                e9c e9c = (e9c) obj;
                int ordinal = e9c.b.ordinal();
                if (ordinal == 1) {
                    return new by4(e9c.f.a);
                }
                if (ordinal == 2) {
                    j3e = new j3e(e9c.e.a, e9c.d);
                } else if (ordinal == 3) {
                    try {
                        j3e = new vc6(b.n(Protos.Attaches.Attach.Photo.parseFrom((byte[]) e9c.g.c)), e9c.d);
                    } catch (InvalidProtocolBufferNanoException e) {
                        hm9.p("l9c", "Can't parse gif", e);
                        return new oi();
                    }
                } else if (ordinal == 4) {
                    return new oi(e9c.d);
                } else {
                    Locale locale = Locale.ENGLISH;
                    hm9.o("l9c", "Unknown recentDb type " + e9c.c);
                    return new oi();
                }
                return j3e;
            case 10:
                return ((OneMeRoomDatabase) obj).M();
            case 11:
                d9c d9c = (d9c) obj;
                d9c.getClass();
                return new sa3(2, new ia4(11, d9c));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        vq7 a2 = hc0.a();
                        a2.t(rawQuery.getString(1));
                        a2.o = d9b.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.j());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 16:
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                return ((jl3) obj).a();
            case 26:
                return Long.valueOf(((d2e) obj).a);
            default:
                return (d2e) ((Map.Entry) obj).getValue();
        }
    }

    public su0 g(Bundle bundle) {
        su0 oj6;
        su0 xsa;
        switch (this.a) {
            case 1:
                boolean z = false;
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i != 0) {
                    if (i == 1) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                            z = true;
                        }
                        np8.d(z);
                        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                        if (f == -1.0f) {
                            oj6 = new xsa();
                        } else {
                            xsa = new xsa(f);
                        }
                    } else if (i == 2) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                            z = true;
                        }
                        np8.d(z);
                        int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                        float f2 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                        if (f2 != -1.0f) {
                            return new zxd(i2, f2);
                        }
                        xsa = new zxd(i2);
                    } else if (i == 3) {
                        np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                        return bundle.getBoolean(Integer.toString(1, 36), false) ? new kte(bundle.getBoolean(Integer.toString(2, 36), false)) : new kte();
                    } else {
                        throw new IllegalArgumentException(z7b.h(31, i, "Unknown RatingType: "));
                    }
                    return xsa;
                }
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new oj6(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                oj6 = new oj6();
                return oj6;
            default:
                boolean z2 = false;
                if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                    z2 = true;
                }
                np8.d(z2);
                int i3 = bundle.getInt(Integer.toString(1, 36), 5);
                float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f3 == -1.0f ? new zxd(i3) : new zxd(i3, f3);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 21:
                return !oag.t((String) obj);
            default:
                g20 g20 = ((l20) obj).a;
                return g20 == g20.c || g20 == g20.o;
        }
    }
}
