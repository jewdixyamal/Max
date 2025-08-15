package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: dy0  reason: default package */
public final /* synthetic */ class dy0 implements qod {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ dy0(py0 py0, bg1 bg1, qod qod) {
        this.b = py0;
        this.c = bg1;
        this.o = null;
        this.X = qod;
    }

    public final void j(JSONObject jSONObject) {
        qod qod;
        switch (this.a) {
            case 0:
                bg1 bg1 = (bg1) this.c;
                py0 py0 = (py0) this.b;
                a4c a4c = py0.V0;
                a4c.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int i = obg.b[au1.s(py0.y(bg1, jSONObject.optJSONObject("participant")))];
                    if (i == 1) {
                        qod qod2 = (qod) this.o;
                        if (qod2 != null) {
                            qod2.j(jSONObject);
                            return;
                        }
                        return;
                    } else if (i == 2 && (qod = (qod) this.X) != null) {
                        qod.j(new JSONObject().put("error", (Object) "state.accepted"));
                        return;
                    } else {
                        return;
                    }
                } catch (JSONException e) {
                    a4c.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                fpd S = optJSONObject != null ? ((qz7) ((h7b) this.b).b).S(optJSONObject, (zad) ((w4d) this.c).b) : null;
                if (S == null) {
                    ((m56) this.o).invoke(new RuntimeException("Can't parse chunk " + jSONObject));
                    return;
                }
                ((m56) this.X).invoke(S);
                return;
        }
    }

    public /* synthetic */ dy0(h7b h7b, w4d w4d, om8 om8, ey3 ey3) {
        this.b = h7b;
        this.c = w4d;
        this.o = om8;
        this.X = ey3;
    }
}
