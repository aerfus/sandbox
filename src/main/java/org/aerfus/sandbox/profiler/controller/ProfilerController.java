package org.aerfus.sandbox.profiler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class ProfilerController {

    private static Map<String, String> generateMap() {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.put("key7", "value7");
        map.put("key8", "value8");
        map.put("key9", "value9");
        map.put("key10", "value10");
        map.put("key11", "value11");
        map.put("key12", "value12");
        map.put("key13", "value13");
        map.put("key14", "value14");
        map.put("key15", "value15");
        map.put("key16", "value16");
        map.put("key17", "value17");
        map.put("key18", "value18");
        map.put("key19", "value19");
        map.put("key20", "value20");
        map.put("key21", "value21");
        map.put("key22", "value22");
        map.put("key23", "value23");
        map.put("key24", "value24");
        map.put("key25", "value25");
        map.put("key26", "value26");
        map.put("key27", "value27");
        map.put("key28", "value28");
        map.put("key29", "value29");
        map.put("key30", "value30");
        map.put("key31", "value31");
        map.put("key32", "value32");
        map.put("key33", "value33");
        map.put("key34", "value34");
        map.put("key35", "value35");
        map.put("key36", "value36");
        map.put("key37", "value37");
        map.put("key38", "value38");
        map.put("key39", "value39");
        map.put("key40", "value40");
        map.put("key41", "value41");
        map.put("key42", "value42");
        map.put("key43", "value43");
        map.put("key44", "value44");
        map.put("key45", "value45");
        map.put("key46", "value46");
        map.put("key47", "value47");
        map.put("key48", "value48");
        map.put("key49", "value49");
        map.put("key50", "value50");
        map.put("key51", "value51");
        map.put("key52", "value52");
        map.put("key53", "value53");
        map.put("key54", "value54");
        map.put("key55", "value55");
        map.put("key56", "value56");

        return map;
    }

    @PostMapping("/profiler")
    public ResponseEntity<String> profiler() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("Hello!");
            sb.append("\n");
            sb.append(generateMap().get("key51"));

            sb.append("\t");
        }

        return ResponseEntity.ok(sb.toString());
    }
}
