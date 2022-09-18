package com.example.daythreetasktwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.daythreetasktwo.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Product product[] = new Product[4];
    double sum = 0;
    boolean pressed = false;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        product[0] = new Product(getResources().getDrawable(R.drawable.pepperred), "Bell Pepper Red", "1kg, Price");
        binding.setProduct1(product[0]);
        product[0].price = 4.99;
        product[1] = new Product();
        product[1].setMany(getResources().getDrawable(R.drawable.eggs), "Egg Chicken Red", "4pcs, Price");
        product[2] = new Product();
        product[1].price = 1.99;
        product[2].setMany(getResources().getDrawable(R.drawable.banana), "Organic Bananas", "12kg, Price");
        product[2].price = 2.99;
        product[3] = new Product();
        product[3].setMany(getResources().getDrawable(R.drawable.ginger), "Ginger", "250gm, Price");
        product[3].price = 2.99;
        binding.setProduct1(product[0]);
        binding.setProduct2(product[1]);
        binding.setProduct3(product[2]);
        binding.setProduct4(product[3]);
        sum += product[0].price + product[1].price + product[2].price + product[3].price;
        binding.message.setVisibility(View.GONE);
        binding.setTotalPrice("$" + Double.toString(sum));
    }

    @SuppressLint("SetTextI18n")
    public void goToCheckout(View view) {
        if (product[0].numberOfProducts == 0 && product[1].numberOfProducts == 0 && product[2].numberOfProducts == 0 && product[3].numberOfProducts == 0) {
            Toast.makeText(this, "Are you Kidding ME !! \nThere's no items", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!pressed) {
            Toast.makeText(this, "Please Check the text under this button to check the number of products", Toast.LENGTH_SHORT).show();
            pressed = true;
            String s[] = new String[4];
            for (int i = 0; i < 4; i++) {
                s[i] = new String();
                s[i] = product[i].productName + " --> " + product[i].numberOfProducts + " * " + product[i].price + '\n';
            }
            binding.message.setVisibility(View.VISIBLE);
            binding.message.setText(s[0] + s[1] + s[2] + s[3] + "Are you sure you want to proceed ?");
        } else {
            Toast.makeText(this, "Thank you for your Shopping", Toast.LENGTH_SHORT).show();
            binding.message.setVisibility(View.GONE);
            pressed = false;
        }
    }

    public void Increase(View view) {
        if (product[0].numberOfProducts == 15)
            Toast.makeText(this, "Excess Amount", Toast.LENGTH_SHORT).show();
        else {
            product[0].numberOfProducts++;
            sum += product[0].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts.setText(product[0].getNumberOfProducts());

    }

    public void Increase2(View view) {
        if (product[1].numberOfProducts == 15)
            Toast.makeText(this, "Excess Amount", Toast.LENGTH_SHORT).show();
        else {
            product[1].numberOfProducts++;
            sum += product[1].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts2.setText(product[1].getNumberOfProducts());
    }

    public void Increase3(View view) {
        if (product[2].numberOfProducts == 15)
            Toast.makeText(this, "Excess Amount", Toast.LENGTH_SHORT).show();
        else {
            product[2].numberOfProducts++;
            sum += product[2].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts3.setText(product[2].getNumberOfProducts());
    }

    public void Increase4(View view) {
        if (product[3].numberOfProducts == 15)
            Toast.makeText(this, "Excess Amount", Toast.LENGTH_SHORT).show();
        else {
            product[3].numberOfProducts++;
            sum += product[3].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts4.setText(product[3].getNumberOfProducts());
    }

    public void decrease(View view) {
        if (product[0].numberOfProducts == 0)
            Toast.makeText(this, "The value can't be less than zero", Toast.LENGTH_SHORT).show();
        else {
            product[0].numberOfProducts--;
            sum -= product[0].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts.setText(product[0].getNumberOfProducts());
    }

    public void decrease2(View view) {
        if (product[1].numberOfProducts == 0)
            Toast.makeText(this, "The value can't be less than zero", Toast.LENGTH_SHORT).show();
        else {
            product[1].numberOfProducts--;
            sum -= product[1].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts2.setText(product[1].getNumberOfProducts());
    }

    public void decrease3(View view) {
        if (product[2].numberOfProducts == 0)
            Toast.makeText(this, "The value can't be less than zero", Toast.LENGTH_SHORT).show();
        else {
            product[2].numberOfProducts--;
            sum -= product[2].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts3.setText(product[2].getNumberOfProducts());
    }

    public void decrease4(View view) {
        if (product[3].numberOfProducts == 0)
            Toast.makeText(this, "The value can't be less than zero", Toast.LENGTH_SHORT).show();
        else {
            product[3].numberOfProducts--;
            sum -= product[3].price;
            binding.setTotalPrice("$" + Double.toString(sum));
        }
        binding.numberOfProducts4.setText(product[3].getNumberOfProducts());
    }
}