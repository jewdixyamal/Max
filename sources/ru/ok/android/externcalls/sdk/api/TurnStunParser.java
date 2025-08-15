package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/TurnStunParser;", "", "<init>", "()V", "Ldb7;", "reader", "", "Lorg/webrtc/PeerConnection$IceServer;", "parseTurn", "(Ldb7;)Ljava/util/List;", "parseStun", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class TurnStunParser {
    public static final TurnStunParser INSTANCE = new TurnStunParser();

    private TurnStunParser() {
    }

    public static final List<PeerConnection.IceServer> parseStun(db7 db7) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList<>();
        db7.s();
        while (db7.hasNext()) {
            String T = db7.T();
            if (T.hashCode() == 3598564 && T.equals("urls")) {
                db7.u();
                while (db7.hasNext()) {
                    arrayList.add(db7.H());
                }
                db7.t();
            } else {
                db7.z();
            }
        }
        db7.q();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).createIceServer());
            }
        }
        return arrayList2;
    }

    public static final List<PeerConnection.IceServer> parseTurn(db7 db7) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList<>();
        db7.s();
        String str = null;
        String str2 = null;
        while (db7.hasNext()) {
            String T = db7.T();
            int hashCode = T.hashCode();
            if (hashCode != -683415465) {
                if (hashCode != -265713450) {
                    if (hashCode == 3598564 && T.equals("urls")) {
                        db7.u();
                        while (db7.hasNext()) {
                            arrayList.add(db7.H());
                        }
                        db7.t();
                    }
                } else if (T.equals("username")) {
                    str2 = db7.f0();
                }
            } else if (T.equals("credential")) {
                str = db7.f0();
            }
            db7.z();
        }
        db7.q();
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            if (str3.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str3).setUsername(str2).setPassword(str).setTlsCertPolicy(PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE).createIceServer());
            }
        }
        return arrayList2;
    }
}
