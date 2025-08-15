package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dq1  reason: default package */
public final class dq1 {
    public final a4c a;

    public /* synthetic */ dq1(a4c a4c) {
        this.a = a4c;
    }

    public cq1 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new kp1(new lp1(bg1.a(jSONObject3.getString("id")), jSONObject3.getLong("addedTs")), f46.k(jSONObject2)));
            }
            return new cq1(arrayList, jSONObject.optInt("totalCount", 0), jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            this.a.log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    public qkf b(gy8 gy8) {
        int s0 = gy8.s0();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < s0; i4++) {
            if (i4 != 0) {
                boolean z = true;
                if (i4 == 1) {
                    i2 = gy8.v0();
                } else if (i4 != 2) {
                    try {
                        gy8.z();
                    } catch (Throwable th) {
                        this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    n1 A0 = gy8.A0();
                    if (!(A0.e() == 3)) {
                        continue;
                    } else {
                        int e = A0.e();
                        if (e != 0) {
                            if (e != 1) {
                                z = false;
                            }
                            if (!z) {
                                i3 = A0.k().d();
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            } else {
                i = gy8.v0();
            }
        }
        return new qkf(new pkf(i, i2, i3));
    }
}
