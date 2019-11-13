package com.shresthagaurav.esoftwarica.ui.student;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.shresthagaurav.esoftwarica.R;
import com.shresthagaurav.esoftwarica.model.DataSet;

public class StudentFragment extends Fragment {
    EditText sname, saddress, sage;
    Button btnAdd;
    RadioGroup genderRG;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adduser, container, false);
        sname = view.findViewById(R.id.etASnmae);
        saddress = view.findViewById(R.id.etASaddress);
        sage = view.findViewById(R.id.etASage);
        sname = view.findViewById(R.id.etASnmae);
        genderRG = view.findViewById(R.id.rgGender);
        btnAdd = view.findViewById(R.id.btnadd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSet dataSet = new DataSet();
                String sn, sa, sadd, gen;
                if (!TextUtils.isEmpty(sname.getText().toString())) {
                    sn = sname.getText().toString();
                    if (!TextUtils.isEmpty(saddress.getText().toString())) {
                        sadd = saddress.getText().toString();
                        if (!TextUtils.isEmpty(sage.getText().toString())) {
                            sa = sage.getText().toString();
                            try {
                                int selectid = genderRG.getCheckedRadioButtonId();
                                RadioButton radioButton = getView().findViewById(selectid);
                                gen = radioButton.getText().toString();
                                Toast.makeText(getContext(), "Welcome " +sn+sa+sadd+gen, Toast.LENGTH_SHORT).show();
                                dataSet.setStuage(sn);
                                dataSet.setStuaddress(sadd);
                                dataSet.setStuage(sa);
                                dataSet.setStugender(gen);
                            } catch (Exception e) {
                                Toast.makeText(getContext(), "Please select gender", Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            sage.setError("please enter age");
                        }
                    } else {
                        sage.setError("please enter address");
                    }
                } else {
                    sage.setError("please enter name");
                }

            }
        });
        return view;
    }
}

//

//}