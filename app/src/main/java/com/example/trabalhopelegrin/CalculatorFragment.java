package com.example.trabalhopelegrin;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

public class CalculatorFragment extends Fragment {

    private EditText edtNota1, edtNota2, edtNota3;
    private Button btnCalcular, btnReset;

    public CalculatorFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        edtNota1 = view.findViewById(R.id.edtNota1);
        edtNota2 = view.findViewById(R.id.edtNota2);
        edtNota3 = view.findViewById(R.id.edtNota3);
        btnCalcular = view.findViewById(R.id.btnCalcular);
        btnReset = view.findViewById(R.id.btnReset);

        btnCalcular.setOnClickListener(v -> calcularMedia(v));
        btnReset.setOnClickListener(v -> resetCampos());

        return view;
    }

    private void calcularMedia(View v) {
        String strNota1 = edtNota1.getText().toString();
        String strNota2 = edtNota2.getText().toString();
        String strNota3 = edtNota3.getText().toString();

        if (TextUtils.isEmpty(strNota1) || TextUtils.isEmpty(strNota2) || TextUtils.isEmpty(strNota3)) {
            Snackbar.make(v, "Preencha todas as notas", Snackbar.LENGTH_SHORT).show();
            return;
        }

        double nota1 = Double.parseDouble(strNota1);
        double nota2 = Double.parseDouble(strNota2);
        double nota3 = Double.parseDouble(strNota3);

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado;

        if (media < 4) {
            resultado = "Reprovado - Média: " + String.format("%.2f", media);
        } else if (media < 6) {
            resultado = "Recuperação - Média: " + String.format("%.2f", media);
        } else {
            resultado = "Aprovado - Média: " + String.format("%.2f", media);
        }

        Snackbar.make(v, resultado, Snackbar.LENGTH_LONG).show();
    }

    private void resetCampos() {
        edtNota1.setText("");
        edtNota2.setText("");
        edtNota3.setText("");
        edtNota1.requestFocus();
    }
}
