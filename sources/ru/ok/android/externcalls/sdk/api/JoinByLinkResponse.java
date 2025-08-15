package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.rate.RateCallData;

public final class JoinByLinkResponse {
    public static final za7 PARSER = new ig5(27);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isP2PForbidden;
    public final List<PeerConnection.IceServer> stun;
    public final String token;
    public final List<PeerConnection.IceServer> turn;

    public JoinByLinkResponse(String str, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, String str2, String str3, String str4, boolean z, int i) {
        this.id = str;
        this.deviceIndex = i;
        this.turn = list;
        this.endpoint = str2;
        this.token = str3;
        this.isP2PForbidden = z;
        this.stun = list2;
        this.clientType = str4;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JoinByLinkResponse lambda$static$0(db7 db7) throws IOException, JsonParseException {
        List<PeerConnection.IceServer> emptyList = Collections.emptyList();
        List<PeerConnection.IceServer> emptyList2 = Collections.emptyList();
        db7.s();
        List<PeerConnection.IceServer> list = emptyList;
        List<PeerConnection.IceServer> list2 = emptyList2;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        int i = 0;
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            char c = 65535;
            switch (T.hashCode()) {
                case -173671634:
                    if (T.equals(ApiProtocol.KEY_CLIENT_TYPE)) {
                        c = 0;
                        break;
                    }
                    break;
                case -17633304:
                    if (T.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                        c = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (T.equals("id")) {
                        c = 2;
                        break;
                    }
                    break;
                case 110541305:
                    if (T.equals(ApiProtocol.KEY_TOKEN)) {
                        c = 3;
                        break;
                    }
                    break;
                case 781502804:
                    if (T.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                        c = 4;
                        break;
                    }
                    break;
                case 836670789:
                    if (T.equals(ApiProtocol.KEY_TURN_SERVER)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1702739560:
                    if (T.equals(ApiProtocol.KEY_STUN_SERVER)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1741102485:
                    if (T.equals(ApiProtocol.KEY_ENDPOINT)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str4 = db7.H();
                    break;
                case 1:
                    z = db7.a0();
                    break;
                case 2:
                    str = db7.H();
                    break;
                case 3:
                    str3 = db7.H();
                    break;
                case 4:
                    i = db7.D();
                    break;
                case 5:
                    list = TurnStunParser.parseTurn(db7);
                    break;
                case 6:
                    list2 = TurnStunParser.parseStun(db7);
                    break;
                case 7:
                    str2 = db7.H();
                    break;
                default:
                    db7.z();
                    break;
            }
        }
        db7.q();
        return new JoinByLinkResponse(str, list, list2, str2, str3, str4, z, i);
    }

    public ConversationParams toParams(ConversationParams conversationParams) {
        ConversationParams conversationParams2 = new ConversationParams();
        LinkedList linkedList = new LinkedList(this.turn);
        if (conversationParams != null) {
            conversationParams2.rateCallData = conversationParams.rateCallData;
            linkedList.addAll(conversationParams.stunTurnServers);
        } else {
            conversationParams2.rateCallData = new RateCallData(0, Collections.emptyList());
        }
        conversationParams2.endpoint = this.endpoint;
        conversationParams2.deviceIndex = this.deviceIndex;
        conversationParams2.token = this.token;
        conversationParams2.stunTurnServers = linkedList;
        return conversationParams2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinByLinkResponse{id='");
        sb.append(this.id);
        sb.append("', deviceIndex='");
        sb.append(this.deviceIndex);
        sb.append("', turn=");
        sb.append(this.turn);
        sb.append(", endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        return zr6.l(sb, this.token, "'}");
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turn);
        linkedList.addAll(this.stun);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.deviceIndex = this.deviceIndex;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        conversationParams.isP2PForbidden = this.isP2PForbidden;
        return conversationParams;
    }
}
